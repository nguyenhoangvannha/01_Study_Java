package autorename;

import java.io.File;

public class FileFactory {
	private static File file;
	private static File[] lstFile;
	
	/*
	 * Get list of file in the path folder
	 * return the list of file and folder in path if it exist
	 * return "Folder does not exist" if folder does not exist
	 * return "Folder is empty" if folder contains no file and no folder
	 */
	public static String getListFiles(String path) {
		StringBuilder strb = new StringBuilder();
		file = new File(path);
		if(!file.isDirectory()) {
			strb.append("Folder does not exist");
		} else {
			lstFile = file.listFiles();
			if(lstFile.length == 0) {
				strb.append("Folder is empty");
			} else {
				for(File item: lstFile) {
					strb.append(item.getAbsolutePath() + "\n");
				}
			}
		}
		return strb.toString();
	}

	public static boolean renameFiles(String path, String replaceType, String strNew, String strOld) {
		if(path == null || replaceType == null || strNew == null || strOld == null) {
			return false;
		}
		
		file = new File(path);
		if(!file.isDirectory()) {
			return false;
		} else {
			lstFile = file.listFiles();
			if(lstFile.length == 0) {
				return false;
			} else {
				for(File item : lstFile) {
					if(item.isFile()) {
						String name = item.getName();
						System.out.println(name);
						String ext = name.substring(name.lastIndexOf(".") + 1, name.length());
						String head = name.substring(0, name.lastIndexOf("."));
						String newName = "";
						if(replaceType.equals("Normal")) {
							newName = head.replace(strOld, strNew) + "." + ext;
						} else
						if(replaceType.equals("Regex"))  {
							newName = head.replaceAll(strOld, strNew) + "." + ext;
						}
						File newFile = new File(path + "/" + newName);
						item.renameTo(newFile);
						System.out.println(path + "/" + newName + "\n");
					}
				}
				return true;
			}
		}
	}
}
