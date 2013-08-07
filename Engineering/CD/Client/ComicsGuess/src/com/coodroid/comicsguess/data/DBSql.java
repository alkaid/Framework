package com.coodroid.comicsguess.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.alkaid.base.common.LogUtil;
import com.alkaid.base.data.BaseSQL;

public class DBSql extends BaseSQL {
	public final static String DBNAME="comics.db";
	public final static int VERSION=1;
	
	//TODO example for a table contants
	/*public static class DBGroup{
		*//**表名*//*
		public static String tableName="is_group";
		//字段名
		public static String fId="_id";
		public static String fName="name";
		public static String fType="type";
	}
	
	public static class DBBean{
		*//**表名*//*
		public static String tableName="is_bean";
		//字段名
		public static String fId="_id";
		public static String fName="name";
		public static String fGroupId="groupId";
		public static String fType="type";
		public static String fCmd="cmd";
		public static String fFirstLetter="firstLetter";
		public static String fFirstLetters="firstLetters";
		public static String fFullLetters="fullLetters";
		public static String fRingtoneUri="ringtoneUri";
	}*/
	
	public DBSql(Context context) {
		super(context);
	}
	
	@Override
	protected SQLiteOpenHelper createDBHelper() {
		return new DBHelper(context);
	}

	public class DBHelper extends SQLiteOpenHelper{
		private Context context;
		public DBHelper(Context context) {
			super(context, DBNAME, null, VERSION);
			this.context=context;
		}
		
		@Override
		public void onCreate(SQLiteDatabase db) {
			//TODO example for create table
			/*//删表
			String sql = "DROP TABLE IF EXISTS " + DBGroup.tableName;
			db.execSQL(sql);
			sql = "DROP TABLE IF EXISTS " + DBBean.tableName;
			db.execSQL(sql);
			//建表
			StringBuilder creatSQL=new StringBuilder();
			creatSQL.append("CREATE TABLE IF NOT EXISTS ").append(DBGroup.tableName)
				.append(" ( ")
				.append(DBGroup.fId).append("  INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,")
				.append(DBGroup.fName).append("  verchar(255),")
				.append(DBGroup.fType).append("  int(4) NOT NULL DEFAULT "+Type.NORMAL.ordinal()+");")
				.append("\n");
			LogUtil.d(creatSQL.toString());
			db.execSQL(creatSQL.toString());
			creatSQL=new StringBuilder();
			creatSQL.append("CREATE TABLE IF NOT EXISTS ").append(DBBean.tableName)
				.append(" ( ")
				.append(DBBean.fId).append("  INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,")
				.append(DBBean.fName).append("  verchar(255),")
				.append(DBBean.fFirstLetter).append("  verchar(2),")
				.append(DBBean.fFirstLetters).append("  verchar(255),")
				.append(DBBean.fFullLetters).append("  verchar(500),")
				.append(DBBean.fRingtoneUri).append("  verchar(255),")
				.append(DBBean.fGroupId).append("  INTEGER NOT NULL,")
				.append(DBBean.fCmd).append("  int(10) NOT NULL,")
				.append(DBBean.fType).append("  int(4) NOT NULL DEFAULT "+Type.NORMAL.ordinal()+");")
				.append("\n");
			LogUtil.d(creatSQL.toString());
			db.execSQL(creatSQL.toString());
			//解析并插入数据
*/		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			LogUtil.i("Database onUpgrade");
		}
		
	}
	
}
