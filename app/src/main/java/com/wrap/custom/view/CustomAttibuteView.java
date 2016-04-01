package com.wrap.custom.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

import com.wrap.tian.customviewattributes.R;


/**
 * Created by tiantan on 2016/4/1.
 */
public class CustomAttibuteView extends View{

    public CustomAttibuteView(Context context) {
        super(context);
    }

    public CustomAttibuteView(Context context, AttributeSet attrs) {
        super(context, attrs);
        /**
         * AttributeSet 对XML文件解析后的结果，封装为AttributeSet对象。
         * 存储的都是原始数据，对数据进行简单的加工。
         */

        int count = attrs.getAttributeCount();
        for (int i = 0; i < count; i++) {
            String name = attrs.getAttributeName(i);
            String value = attrs.getAttributeValue(i);
            System.out.println("name : "+name+"  value : "+value);
        }

        /**
         * TypedArray是对Attribute 中的原始数据 按照图纸中的说明（R.styleable.CustomAttributeView 中的类型声明）
         * 创建具体的对象
         */
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomAttibuteView);

        //获得对象的个数
        int typedArrayCount = typedArray.getIndexCount();

        for (int i = 0; i < typedArrayCount; i++) {
            int itemId = typedArray.getIndex(i);
            System.out.println("itemId::"+itemId);

            switch (itemId){
                case R.styleable.CustomAttibuteView_viewId :
                    break;
                case R.styleable.CustomAttibuteView_viewText:
                    break;
                case R.styleable.CustomAttibuteView_bitmap:
                    break;
                default:
                    break;
            }
        }

    }

    public CustomAttibuteView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
