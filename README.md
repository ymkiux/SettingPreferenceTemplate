# SettingPreference
PreferenceScreen+androidx+fragment
- 使用Androidx的Preference导入依赖
        
        dependencies {
        def preference_version = "1.1.1"
        implementation "androidx.preference:preference:$preference_version"
        }
- 使用toolbar控件
      - 自定义toolbar内部
  
  
        <?xml version="1.0" encoding="utf-8"?>
        <androidx.appcompat.widget.Toolbar xmlns:android="http://schemas.android.com/apk/res/android"
        android:id="@+id/toolbar"
        android:layout_width="match_parent"
        android:layout_height="?attr/actionBarSize"
        android:background="@color/colorPrimaryDark">
        <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_gravity="center"
        android:text="@string/preferencescreen"
        android:textColor="@android:color/white"
        android:textSize="20sp" />
        </androidx.appcompat.widget.Toolbar>
              
      <!--通过include引用即可-->
      
      
      
 - 优点
    - PreferenceScreen的简易使用
    - 更轻松的了解到Androidx中fragment基本使用
