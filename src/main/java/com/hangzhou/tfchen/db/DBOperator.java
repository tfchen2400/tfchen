/*     */ package com.hangzhou.tfchen.db;
/*     */ 

/*     */

import java.sql.*;
import java.util.Properties;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ public class DBOperator
/*     */ {
/*  20 */   private PreparedStatement ps = null;
/*  21 */   private ResultSet rs = null;
/*  22 */   private Connection con = null;
/*  23 */   private boolean showSql = true;
/*     */
/*  25 */   private CallableStatement cst = null;
/*     */
/*     */   public DBOperator() throws Exception {
/*  28 */     initialize();
/*     */   }
/*     */   public DBOperator(String type) throws Exception {
/*  31 */     initialize(type);
/*     */   }
/*     */
/*     */   protected synchronized void initialize()
/*     */     throws Exception
/*     */   {
/*  40 */     Class.forName("com.mchz.brook.jdbc.proxy.DriverLoggingProxy").newInstance();
///*     */
/*  44 */     String url = "jdbc:jdbcdslog:oracle:thin:@192.168.60.95:1521/wangzw;targetDriver=oracle.jdbc.OracleDriver";
        //Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
/*     */
/*  44 */ //    String url = "jdbc:oracle:thin:@192.168.60.95:1521/wangzw";
    Properties info = new Properties();
    info.put("user","scott");
    info.put("password","scott");
/*     */
/*  46 */     this.con = DriverManager.getConnection(url, info);
/*  47 */     if (this.con != null)
/*  48 */       this.con.setAutoCommit(false);
/*     */   }
/*     */
/*     */   protected synchronized void initialize(String type) throws Exception {
/*  52 */     if ("oracle".equals(type)) {
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
/*     */
/*  44 */   String url = "jdbc:oracle:thin:@192.168.60.95:1521/wangzw";

/*     */     Properties info = new Properties();
            info.put("user","scott");
            info.put("password","scott");
//            info.put("v$session.program", "ctf");
//            info.put("v$session.terminal", "ctft");
/*  46 */     this.con = DriverManager.getConnection(url,info);
/*  47 */     if (this.con != null)
/*  48 */       this.con.setAutoCommit(false);
/*     */     }
/*  59 */     else if ("tjscdb".equals(type)) {
/*  60 */       Class.forName("oracle.jdbc.driver.OracleDriver");
/*  61 */       String url = "jdbc:oracle:thin:@(description=(ADDRESS_LIST =(ADDRESS = (PROTOCOL = TCP)(HOST = 192.26.3.240)(PORT = 1521)))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = orcl)))";
/*  62 */       this.con = DriverManager.getConnection(url, "HOSPITAL", "123456");
/*  63 */       if (this.con != null)
/*  64 */         this.con.setAutoCommit(false);
/*     */     }
/*     */     else {
/*  67 */       initialize();
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public void rollback() {
/*     */     try {
/* 269 */       this.con.rollback();
/*     */     } catch (SQLException e) {
/* 271 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */
/*     */   public void commit() throws Exception {
/* 276 */     if (!this.con.getAutoCommit())
/* 277 */       this.con.commit();
/*     */   }
/*     */
/*     */   public synchronized void freeCon()
/*     */   {
/*     */     try
/*     */     {
/* 284 */       if (this.rs != null) {
/* 285 */         this.rs.close();
/*     */       }
/* 287 */       if (this.ps != null) {
/* 288 */         this.ps.close();
/*     */       }
/* 290 */       if (this.con != null)
/* 291 */         this.con.close();
/*     */     }
/*     */     catch (SQLException ex) {
/* 294 */       ex.printStackTrace();
/*     */     }
/*     */   }

    public int update(String sql)
            throws Exception
    {
        if (this.showSql) {
            System.out.print(sql);
            int i = 0;
            System.out.println("");
        }
        int num = 0;
        this.ps = this.con
                .prepareStatement(sql, 1005,
                        1007);
        this.ps.setQueryTimeout(20);
        num = this.ps.executeUpdate();
        return num;
    }
        }
