package com.example.a10118427_catatanharian;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CatatanHarianImp extends SQLiteOpenHelper implements CatatanHarianInterface{
    public CatatanHarianImp(Context context) {
        super(context, "db_catatanharian", null, 1 );
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("CREATE TABLE tbl_catatanharian(id TEXT, tanggal TEXT, judul TEXT, kategori TEXT, isi TEXT ) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sql, int i, int il) {
        sql.execSQL("DROP TABLE tbl_catatanharian");

    }

    @Override
    public Cursor read() {
        SQLiteDatabase sql = getReadableDatabase();
        return sql.rawQuery("SELECT * FROM tbl_catatanharian", null);
    }

    @Override
    public boolean create(CatatanHarian catatanHarian) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("INSERT INTO tbl_catatanharian VAlUES( '"+catatanHarian.getId()+"','"+catatanHarian.getTanggal()+"','"+catatanHarian.getJudul()+"','"+catatanHarian.getKategori()+"','"+catatanHarian.getIsi()+"')");
        return true;
    }

    @Override
    public boolean update(CatatanHarian catatanHarian) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("UPDATE tbl_catatanharian SET tanggal='"+catatanHarian.getTanggal()+"', judul='"+catatanHarian.getJudul()+"', kategori='"+catatanHarian.getKategori()+"', isi='"+catatanHarian.getIsi()+"' " + "" +
                "WHERE id='"+catatanHarian.getId()+"' ");
        return true;
    }

    @Override
    public boolean delete(String id) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("DELETE FROM tbl_catatanharian WHERE id='"+id+"'");

        return true;
    }


}
