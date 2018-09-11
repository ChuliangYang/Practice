package com.me.cl.template;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.me.cl.template.databinding.ContentWelcomeBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CONTENTWELCOME = 1;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(1);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.me.cl.template.R.layout.content_welcome, LAYOUT_CONTENTWELCOME);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CONTENTWELCOME: {
          if ("layout/content_welcome_0".equals(tag)) {
            return new ContentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_welcome is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    final int code = tag.hashCode();
    switch(code) {
      case 26528424: {
        if(tag.equals("layout/content_welcome_0")) {
          return R.layout.content_welcome;
        }
        break;
      }
    }
    return 0;
  }

  @Override
  public String convertBrIdToString(int id) {
    String tmpVal = InnerBrLookup.sKeys.get(id);
    return tmpVal;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(com.me.cl.template.BR._all, "_all");
      sKeys.put(com.me.cl.template.BR.user, "user");
    }
  }
}
