package com.whstone.entities;

import javax.persistence.*;

public class Dept {
    @Id
    private Long deptno;

    private String dname;

    @Column(name = "db_source")
    private String dbSource;

    /**
     * @return deptno
     */
    public Long getDeptno() {
        return deptno;
    }

    /**
     * @param deptno
     */
    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    /**
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * @return db_source
     */
    public String getDbSource() {
        return dbSource;
    }

    /**
     * @param dbSource
     */
    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}