//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.3.0.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package mic.unlimited.com.reportingapp.Events.Question;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import mic.unlimited.com.reportingapp.R;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.builder.PostActivityStarter;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class Event2Q_
    extends Event2Q
    implements HasViews, OnViewChangedListener
{
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(R.layout.activity_q_event2);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static Event2Q_.IntentBuilder_ intent(Context context) {
        return new Event2Q_.IntentBuilder_(context);
    }

    public static Event2Q_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new Event2Q_.IntentBuilder_(fragment);
    }

    public static Event2Q_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new Event2Q_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.supervisorPositionEvent2 = ((EditText) hasViews.findViewById(R.id.supervisorPositionEvent2));
        this.maleEvent2 = ((EditText) hasViews.findViewById(R.id.maleEvent2));
        this.femaleEvent2 = ((EditText) hasViews.findViewById(R.id.femaleEvent2));
        this.event2date = ((TextView) hasViews.findViewById(R.id.event2date));
        this.startDate = ((TextView) hasViews.findViewById(R.id.startDate));
        this.endDate = ((TextView) hasViews.findViewById(R.id.endDate));
        View view_inc = hasViews.findViewById(R.id.inc);
        View view_pickDateEvent2 = hasViews.findViewById(R.id.pickDateEvent2);
        View view_pickStartDateEvent2 = hasViews.findViewById(R.id.pickStartDateEvent2);
        View view_pickEndDateEvent2 = hasViews.findViewById(R.id.pickEndDateEvent2);
        View view_saveEvent2 = hasViews.findViewById(R.id.saveEvent2);
        View view_saveMember = hasViews.findViewById(R.id.saveMember);

        if (view_inc!= null) {
            view_inc.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.makeMember();
                }
            }
            );
        }
        if (view_pickDateEvent2 != null) {
            view_pickDateEvent2 .setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.pickDate();
                }
            }
            );
        }
        if (view_pickStartDateEvent2 != null) {
            view_pickStartDateEvent2 .setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.startDate();
                }
            }
            );
        }
        if (view_pickEndDateEvent2 != null) {
            view_pickEndDateEvent2 .setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.endDate();
                }
            }
            );
        }
        if (view_saveEvent2 != null) {
            view_saveEvent2 .setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.collect();
                }
            }
            );
        }
        if (view_saveMember!= null) {
            view_saveMember.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View view) {
                    Event2Q_.this.saveMember();
                }
            }
            );
        }
        init();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<Event2Q_.IntentBuilder_>
    {
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, Event2Q_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), Event2Q_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), Event2Q_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public PostActivityStarter startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                        fragment_.startActivityForResult(intent, requestCode, lastOptions);
                    } else {
                        fragment_.startActivityForResult(intent, requestCode);
                    }
                } else {
                    if (context instanceof Activity) {
                        Activity activity = ((Activity) context);
                        ActivityCompat.startActivityForResult(activity, intent, requestCode, lastOptions);
                    } else {
                        if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
                            context.startActivity(intent, lastOptions);
                        } else {
                            context.startActivity(intent);
                        }
                    }
                }
            }
            return new PostActivityStarter(context);
        }
    }
}
