/**
 * 
 */
package com.quanhu.activie.base.utils;

import java.io.File;

/**
 * created by chenshi at 2017�?10�?20�? 下午10:36:11
 */
public class UpdateFileNameUtils {
	public static void main(String[] args) {
		String fileUrl = "D:/天龙八部";String fileOldName = "[迅播影院www.XunBo.Cc]";String fileReplaceName = "";
		updateFileName(fileUrl,fileOldName,fileReplaceName);
	}
	

	/**
	 * 批量修改文件�?
	 * notes: @param fileUrl
	 * notes: @param fileOldName
	 * notes: @param fileReplaceName
	 */
	private static void updateFileName(String fileUrl, String fileOldName, String fileReplaceName) {
		File f = new File(fileUrl);  
        if (f.exists()) {  
            if (f.isDirectory()) {  
                File[] files = f.listFiles();  
                for (int i = 0; i < files.length; i++) {  
                    String oldname = files[i].getName();  
                    String newname = oldname.replace(fileOldName, fileReplaceName);
                    newname = newname + "";  
                    if (!oldname.equals(newname)) {  
                        String path = files[i].getParent();  
                        File newfile = new File(path + "/" + newname);  
                        if (newfile.exists()) {  
                            System.out.println(newname + "已经存在�?");  
                        } else {  
                            files[i].renameTo(newfile);  
                        }  
                    }  
                }  
            }  
        } else {  
            System.out.println("File does not exist!");  
        }
	}
}
