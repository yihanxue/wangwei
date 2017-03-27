package readExcelSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContentRecord {
	private enum ContentType {
		STRING, HASHMAP, LIST;
	}

	private String value = "";
	private HashMap<String, String> hashMap = new HashMap<>();
	private List<String> list = new ArrayList<String>();
	private ContentType cType;

	public ContentRecord() {
		this("");
	}

	public ContentRecord(String value) {
		this.value = value;
		this.cType = ContentType.STRING;
	}

	public ContentRecord(HashMap<String, String> hashMap) {
		this.hashMap = hashMap;
		this.cType = ContentType.HASHMAP;
	}

	public ContentRecord(List<String> list) {
		this.list = list;
		this.cType = ContentType.LIST;
	}

	public String get() {
		String result = "";
		try {
			if (cType.equals(ContentType.STRING)) {
				result = this.value;
			} else {
				result = "Wrong Type";
			}

		} catch (Exception e) {
			// TODO: handle exception
			result = e.toString();
		}
		return result;
	}

	public String get(String key) {
		String result = "";
		try {
			if (this.cType.equals(ContentType.HASHMAP)) {
				if (this.hashMap.containsKey(key)) {
					result = this.hashMap.get(key);
				} else {
					result = "the key " + key + " is not exist";
				}
			} else {
				result = "Wrong Type";
			}

		} catch (Exception e) {
			// TODO: handle exception
			result = e.toString();
		}
		return result;
	}

	public String get(int index) {
		String result = "";
		try {
			if (cType.equals(ContentType.LIST)) {
				if (index < this.list.size()) {
					result = this.list.get(index);
				} else {
					result = "Index Out Of Bounds";
				}
			} else {
				result = "Wrong Type";
			}
		} catch (Exception e) {
			// TODO: handle exception
			result = e.toString();
		}
		return result;
	}

	public HashMap<String, String> getMap() {
		return hashMap;
	}

}
