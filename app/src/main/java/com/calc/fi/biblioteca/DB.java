package com.calc.fi.biblioteca;
        import android.content.Context;

        import android.database.sqlite.SQLiteDatabase;

        import android.database.sqlite.SQLiteOpenHelper;
/**
 * Created by Hugo_ on 11/12/2017.
 */
public class DB  extends SQLiteOpenHelper{
    public DB(Context context, String name,

                    SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values('admin','admin')");
    }

    @Override    public void onUpgrade(SQLiteDatabase db, int

            oldVersion, int newVersion) {
        db.execSQL("create table usuarios(codigo integer primary key autoincrement,usuario text,contrasena text)");
        db.execSQL("insert into usuarios values('admin','admin')");
    }
}//FIN DE LA CLASE