package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.me.cl.template.DataBinderMapperImpl());
    addMapper(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
  }
}
