/**File Name:MM7DeliverRes.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

public class MM7DeliverRes extends MM7VASPRes
{
  private String ServiceCode;
  private boolean ServiceCodeExist = false;
  public void setServiceCode(String serviceCode)  //����ҵ�����
  {
    this.ServiceCode = serviceCode;
    ServiceCodeExist = true;
  }
  public String getServiceCode()  //���ҵ�����
  {
    return(this.ServiceCode);
  }
  public boolean isServiceCodeExist()  //�Ƿ����ҵ�����
  {
    return(ServiceCodeExist);
  }
  public String toString()  //���ض�����ı���ʾ
  {
    StringBuffer sb = new StringBuffer();
    sb.append("ServiceCode=" + ServiceCode+"\n");
    sb.append("ServiceCodeExist=" + ServiceCodeExist + "\n");
    return sb.toString();
  }
}