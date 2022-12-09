import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "numberDb";
    private static final int DATABASE_VERSION = 1;

    public DbHelper(@Nullable Content content) {
        super(content, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            String sql = "CREATE TABLE "
            DbContract.TABLE_NAME + "(id INTEGER PRIMARY KEY AUTOINCREMENT, "
            DbContract.INCOMING_NUMBER + " text);";
            SQLiteDatabase.execSQL(sql);
        } catch (Exception e) {
            Log.i("INFO", "Erro ao criar tabela!" + e.getMessage());
        }

    }

    @Override
    public void OnUpgrade(SQLiteDatabase sqLiteDatabase, int i, int 10){

    String DROP.TABLE ="DROP TABLE IF EXISTS"+DbConstract.TABLE_NAME;
        sqliteDatabase.execSQL(DROP_TABLE);

    onCreate(sqLiteDatabase);
}
    public void saveNumber(String number, SQLiteDatabase database){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DbContract.INCOMING_NUMBER, number);
        database.insert(DbContract.TABLE_NAME, null, contentValues);
    }

    public Cursor readNumber(SQLiteDatabase database){
        String [] projection = {"id", DbContract.INCOMING_NUMBER};
        Cursor res = database.query(DbContract.TABLE_NAME, projection, null, null, null, null);
        return res;
    }

}
