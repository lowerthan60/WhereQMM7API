package com.cmcc.mm7.vasp.common;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class RetriveApiVersion {
  private String version = "V1.5.3_20040621";
  public RetriveApiVersion() {
  }
  public String getApiVersion()
  {
    return version;
  }
  public static void main(String[] args){
    RetriveApiVersion api = new RetriveApiVersion();
    System.out.println("��ǰʹ�õ�MM7 API�İ汾Ϊ��"+api.getApiVersion());
  }
}