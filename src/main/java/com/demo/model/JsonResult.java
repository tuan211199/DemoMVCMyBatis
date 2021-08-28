package com.demo.model;

import java.util.List;

public class JsonResult<T> {
    public String Result = "ERROR";
    public List<T> Records;
    public List<T> Options;
    public T Record;
    public String Message = "Error message";
    public long TotalRecordCount;
}
