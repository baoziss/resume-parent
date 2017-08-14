package util;

import java.security.MessageDigest;

public class Md5Util {
	public static String getMd5Code(String password){
		try {
			//java.secutiry
			MessageDigest messageDigest = MessageDigest.getInstance("md5") ;
			//加密
			byte[] digest = messageDigest.digest(password.getBytes());
			StringBuilder sb = new StringBuilder();
			//byte转为16进制长度是32位字符串  byte  -128~~~127    0~~255
			for (byte b : digest) {  //0x0-0  0x1-1   0xa-10 0xf 15 0x10-16 0x11-17    
				int c = b & 0xff;
				if(c<16){
					sb.append("0");
				}
				sb.append(Integer.toHexString(c));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
