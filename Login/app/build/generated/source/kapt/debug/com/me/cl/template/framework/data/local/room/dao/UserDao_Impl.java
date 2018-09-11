package com.me.cl.template.framework.data.local.room.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import com.me.cl.template.presentation.entities.User;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Set;

@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Users`(`email`,`passWord`,`name`,`phoneNumber`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getEmail() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEmail());
        }
        if (value.getPassWord() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPassWord());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getPhoneNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getPhoneNumber());
        }
      }
    };
  }

  @Override
  public Long insertUser(User user) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<User> searchUser(String email, String pwd) {
    final String _sql = "select * from Users where email = ? and passWord = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    _argIndex = 2;
    if (pwd == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pwd);
    }
    return new ComputableLiveData<User>() {
      private Observer _observer;

      @Override
      protected User compute() {
        if (_observer == null) {
          _observer = new Observer("Users") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfPassWord = _cursor.getColumnIndexOrThrow("passWord");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPhoneNumber = _cursor.getColumnIndexOrThrow("phoneNumber");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassWord;
            _tmpPassWord = _cursor.getString(_cursorIndexOfPassWord);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final Integer _tmpPhoneNumber;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhoneNumber = null;
            } else {
              _tmpPhoneNumber = _cursor.getInt(_cursorIndexOfPhoneNumber);
            }
            _result = new User(_tmpEmail,_tmpPassWord,_tmpName,_tmpPhoneNumber);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<User> searchUser(String email) {
    final String _sql = "select * from Users where email = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    return new ComputableLiveData<User>() {
      private Observer _observer;

      @Override
      protected User compute() {
        if (_observer == null) {
          _observer = new Observer("Users") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEmail = _cursor.getColumnIndexOrThrow("email");
          final int _cursorIndexOfPassWord = _cursor.getColumnIndexOrThrow("passWord");
          final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
          final int _cursorIndexOfPhoneNumber = _cursor.getColumnIndexOrThrow("phoneNumber");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpPassWord;
            _tmpPassWord = _cursor.getString(_cursorIndexOfPassWord);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final Integer _tmpPhoneNumber;
            if (_cursor.isNull(_cursorIndexOfPhoneNumber)) {
              _tmpPhoneNumber = null;
            } else {
              _tmpPhoneNumber = _cursor.getInt(_cursorIndexOfPhoneNumber);
            }
            _result = new User(_tmpEmail,_tmpPassWord,_tmpName,_tmpPhoneNumber);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }
}
