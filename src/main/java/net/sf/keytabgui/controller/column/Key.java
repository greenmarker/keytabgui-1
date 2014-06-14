package net.sf.keytabgui.controller.column;

import net.sf.keytabgui.controller.Column;
import net.sf.keytabgui.model.row.KeytabRow;
import net.sf.keytabgui.util.ToString;

public class Key implements Column {

	public String getTitle() {
		return "key";
	}
	
	public Object getValue(KeytabRow row) {
		return "0x" + ToString.bytesToHex(row.getKeyblock());
	}

}
