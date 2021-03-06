package com.example.chdbuses;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SwipeAdapter extends PagerAdapter {
   private int[] image_resources={
		   R.drawable.australia,
		   R.drawable.australia_,
		   R.drawable.australia_a,
		   R.drawable.uae,
		   R.drawable.turkey_,
		   R.drawable.turkey_t,
		   R.drawable.turkey_u,
		   R.drawable.sole,
		   R.drawable.moscow_,		   
		   R.drawable.sta,
		   R.drawable.sag,
		   R.drawable.spain_,
		   R.drawable.be,
		   R.drawable.flag,
		   R.drawable.img5_
		   
		   
		   };
    	private Context Ct;
    	private LayoutInflater Linflater;
    	
    	public SwipeAdapter(Context ctx)
    	{
    		this.Ct=ctx;
    	}
    	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return image_resources.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object o) {
		// TODO Auto-generated method stub
		return ( view==(LinearLayout)o);
	}
	
	public Object instantiateItem(ViewGroup container,int position)
	{
		Linflater=(LayoutInflater) Ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		View item=Linflater.inflate(R.layout.layout,container,false);
		ImageView imageView=(ImageView)item.findViewById(R.id.image_view);
		TextView textView=(TextView)item.findViewById(R.id.image_count);
		
		imageView.setImageResource(image_resources[position]);
		textView.setText("!!@_"+position);
		container.addView(item);
	 	return item;
	}
		
		
	
	public void destroyItem(ViewGroup container,int postion,Object object)
	{
	container.removeView((LinearLayout)object);	
	}

}
