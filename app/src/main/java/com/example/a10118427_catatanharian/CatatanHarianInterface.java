package com.example.a10118427_catatanharian;

import android.database.Cursor;

public interface CatatanHarianInterface  {
    public Cursor read();
    public boolean create(CatatanHarian catatanHarian);
    public boolean update(CatatanHarian catatanHarian);
    public boolean delete(String id);
}
