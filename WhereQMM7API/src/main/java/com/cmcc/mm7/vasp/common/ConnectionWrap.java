/**File Name:MM7Config.java
 * Company:  �й��ƶ����Ź�˾
 * Date  :   2004-1-3
 * */

package com.cmcc.mm7.vasp.common;

import com.cmcc.mm7.vasp.conf.MM7Config;
import java.net.*;

public class ConnectionWrap {
  MM7Config mm7c;
  private Socket socket;
  private boolean Free;  //��־�Ƿ����
  public long start;
  private boolean AuthFlag;  //��־�Ƿ񾭹���ժҪ��Ȩ
  private String DigestInfor;
  private int ConnectIndex;
  private boolean UserfulFlag=true;

  public ConnectionWrap()
  {
    Free = true;
    AuthFlag = false;
    DigestInfor = "";
    start = 0;
  }
  public ConnectionWrap(MM7Config mm7config) throws Exception
  {
    mm7c = mm7config;

    /*try{
      String MMSCIP = (String)mm7c.getMMSCIP().get(0);
      int index = MMSCIP.indexOf(":");
      String ip;
      int port;
      if(index == -1)
      {
        ip = MMSCIP;
        port = 80;
      }
      else
      {
        ip = MMSCIP.substring(0,index);
        port = Integer.parseInt(MMSCIP.substring(index+1));
      }
      socket = new Socket(ip,port);
      //socket = new Socket( (String) mm7c.getMMSCIP().get(0), 80);
      Free = true;
      start = 0;
    }catch(Exception e)
    {
      System.out.println(e);
    }*/
  }

  public boolean BuidLink()
  {
    try{
      String MMSCIP = (String)mm7c.getMMSCIP().get(0);
      int index = MMSCIP.indexOf(":");
      String ip;
      int port;
      if(index == -1)
      {
        ip = MMSCIP;
        port = 80;
      }
      else
      {
        ip = MMSCIP.substring(0,index);
        port = Integer.parseInt(MMSCIP.substring(index+1));
      }
      socket = new Socket(ip,port);
      //socket = new Socket( (String) mm7c.getMMSCIP().get(0), 80);
      Free = true;
      start = 0;
      return true;
    }catch(Exception e)
    {
      System.out.println("û�гɹ�������ԭ��"+e);
      return false;
    }

  }


  public Socket getSocket()
  {
    return socket;
  }
  public boolean getFree()
  {
    return(Free);
  }
  public void setFree(boolean bfree)
  {
    Free = bfree;
  }
  public void setAuthFlag(boolean authflag)
  {
    AuthFlag = authflag;
  }
  public boolean getAuthFlag()
  {
    return AuthFlag;
  }
  public void setDigestInfor(String infor)
  {
    DigestInfor = infor;
  }
  public String getDigestInfor()
  {
    return DigestInfor;
  }
  public void setConnectIndex(int index)
  {
    this.ConnectIndex = index;
  }
  public int getConnectIndex()
  {
    return ConnectIndex;
  }
  public void setUserfulFlag(boolean flag)
  {
    this.UserfulFlag = flag;
  }
  public boolean getUserfulFlag()
  {
    return UserfulFlag;
  }
}