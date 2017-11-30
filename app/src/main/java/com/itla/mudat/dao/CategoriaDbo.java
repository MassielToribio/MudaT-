package com.itla.mudat.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.itla.mudat.Entity.Anuncio;

/**
 * Created by Usuario on 11/28/2017.
 */

public class CategoriaDbo {

    public  DbConnection connection;

    public CategoriaDbo(Context context) { connection = new DbConnection(context);}

    public void crear( Anuncio anuncio) {

        SQLiteDatabase db = connection.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put("descripcion", String.valueOf(anuncio.getFecha()));

        db.insert("categoria", null, cv);
        db.close();
    }
}
