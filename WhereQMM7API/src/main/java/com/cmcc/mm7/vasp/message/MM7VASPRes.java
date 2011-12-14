/**File Name:MM7VASPRes.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-2-2
 * */

package com.cmcc.mm7.vasp.message;

public class MM7VASPRes extends MM7Message
{
  private int StatusCode;
  private boolean StatusCodeExist;
  private String StatusText;
  private boolean StatusTextExist;
  private String StatusDetail;
  private boolean StatusDetailExist;

  public MM7VASPRes()
  {
    StatusCode = 0;
  }
  public void setStatusCode(int statusCode)   //����StatusCode
  {
    StatusCode = statusCode;
    StatusCodeExist = true;
  }
  public int getStatusCode()  //���StatusCode
  {
    return(StatusCode );
  }
  public boolean isStatusCodeExist()  //�Ƿ����StatusCode
  {
    return(StatusCodeExist);
  }
  public void setStatusText(String statusText)  //����StatusText
  {
    StatusText = statusText;
    StatusTextExist = true;
  }
  public String getStatusText()  //���StatusText
  {
    return(StatusText);
  }
  public boolean isStatusTextExist()  //�Ƿ����StatusText
  {
    return(StatusTextExist);
  }
  public void setStatusDetail(String statusDetail)  //����StatusDetail
  {
    StatusDetail = statusDetail;
  }
  public String getStatusDetail()  //���StatusDetail
  {
    return(StatusDetail);
  }
  public boolean isStatusDetailExist()  //�Ƿ����StatusDetail
  {
    return(StatusDetailExist);
  }
  public String toString()  //���ض�����ı���ʾ
  {
    StringBuffer sb = new StringBuffer();
    sb.append("StatusCode=" + StatusCode+"\n");
    sb.append("StatusCodeExist=" + StatusCodeExist+"\n");
    sb.append("StatusText=" + StatusText+"\n");
    sb.append("StatusTextExist=" + StatusTextExist+"\n");
    sb.append("StatusDetail=" + StatusDetail+"\n");
    sb.append("StatusDetailExist=" + StatusDetailExist+"\n");
    return sb.toString();
  }
}