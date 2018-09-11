package com.me.cl.template.databinding;
import com.me.cl.template.R;
import com.me.cl.template.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContentWelcomeBindingImpl extends ContentWelcomeBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.toolbar_title, 5);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContentWelcomeBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ContentWelcomeBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.v7.widget.Toolbar) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvName.setTag(null);
        this.tvPhone.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.user == variableId) {
            setUser((com.me.cl.template.presentation.entities.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.me.cl.template.presentation.entities.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userName = null;
        java.lang.String javaLangStringEmailUserEmail = null;
        java.lang.String userEmail = null;
        java.lang.Integer userPhoneNumber = null;
        com.me.cl.template.presentation.entities.User user = mUser;
        java.lang.String javaLangStringPhoneUserPhoneNumber = null;
        java.lang.String javaLangStringNameUserName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.name
                    userName = user.getName();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.phoneNumber
                    userPhoneNumber = user.getPhoneNumber();
                }


                // read ("Name: ") + (user.name)
                javaLangStringNameUserName = ("Name: ") + (userName);
                // read ("Email: ") + (user.email)
                javaLangStringEmailUserEmail = ("Email: ") + (userEmail);
                // read ("Phone: ") + (user.phoneNumber)
                javaLangStringPhoneUserPhoneNumber = ("Phone: ") + (userPhoneNumber);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvEmail, javaLangStringEmailUserEmail);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, javaLangStringNameUserName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvPhone, javaLangStringPhoneUserPhoneNumber);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}