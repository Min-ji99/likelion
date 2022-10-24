package com.line.dao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcContext {
    private DataSource dataSource;

    public JdbcContext(DataSource dataSource){
        this.dataSource=dataSource;
    }

    public void workWithStatementStrategy(StatementStrategy stmt) throws SQLException{
        Connection c=null;
        PreparedStatement ps=null;
        try{
            c= dataSource.getConnection();
            ps=stmt.makePreparedStatement(c);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if(ps!=null){
                try{
                    ps.close();
                }catch (SQLException e){}
            }
            if(c!=null){
                try{
                    c.close();
                }catch (SQLException e){
                }
            }
        }
    }

    public void executeSQL(final String sql) throws SQLException{
        this.jdbcContext.workWithStatementStrategy(new StatementStrategy() {
            public PreparedStatement makePreparedStatement(Connection c) throws SQLException {
                return c.prepareStatement(sql);
            }
        });
    }
}
