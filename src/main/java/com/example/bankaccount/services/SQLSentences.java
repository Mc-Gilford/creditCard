package com.example.bankaccount.services;

import lombok.Data;

@Data
public class SQLSentences {
    private String table;
    private String condition;
    private String params;
    private String sentence;

    public String dropTableIfExist()
    {
        this.sentence="DROP TABLE "+this.table+" IF EXISTS";
        return this.sentence;
    }
    public String createTable()
    {
        this.sentence="CREATE TABLE "+this.table+" "+this.params;
        return this.sentence;
    }
    public String insertInto()
    {
        this.sentence="INSERT INTO "+this.table+this.params;
        return this.sentence;
    }

}
