package slidedatetimepickercsharp;


public class InternalViewPagerListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.view.ViewPager.OnPageChangeListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onPageScrollStateChanged:(I)V:GetOnPageScrollStateChanged_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onPageScrolled:(IFI)V:GetOnPageScrolled_IFIHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"n_onPageSelected:(I)V:GetOnPageSelected_IHandler:Android.Support.V4.View.ViewPager/IOnPageChangeListenerInvoker, Xamarin.Android.Support.v4\n" +
			"";
		mono.android.Runtime.register ("SlideDatetimePickerCSharp.InternalViewPagerListener, SlideDatetimePickerCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", InternalViewPagerListener.class, __md_methods);
	}


	public InternalViewPagerListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == InternalViewPagerListener.class)
			mono.android.TypeManager.Activate ("SlideDatetimePickerCSharp.InternalViewPagerListener, SlideDatetimePickerCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public InternalViewPagerListener (slidedatetimepickercsharp.SlidingTabLayout p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == InternalViewPagerListener.class)
			mono.android.TypeManager.Activate ("SlideDatetimePickerCSharp.InternalViewPagerListener, SlideDatetimePickerCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "SlideDatetimePickerCSharp.SlidingTabLayout, SlideDatetimePickerCSharp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);


	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);


	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
