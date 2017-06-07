//
// DO NOT EDIT THIS FILE.
// Generated using AndroidAnnotations 4.3.0.
// 
// You can create a larger work that contains this file and distribute that work under terms of your choice.
//

package mic.unlimited.com.reportingapp.Phases.Answer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Build.VERSION_CODES;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import mic.unlimited.com.reportingapp.R;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.builder.PostActivityStarter;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class Phase4A_
    extends Phase4A
    implements HasViews, OnViewChangedListener
{
    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    public final static String MOTHER_ID_EXTRA = "motherId";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(R.layout.activity_phase4_answer);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
        injectExtras_();
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

    public static Phase4A_.IntentBuilder_ intent(Context context) {
        return new Phase4A_.IntentBuilder_(context);
    }

    public static Phase4A_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new Phase4A_.IntentBuilder_(fragment);
    }

    public static Phase4A_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new Phase4A_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        this.Phase4Question1Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question1Answer));
        this.Phase4Question2Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question2Answer));
        this.Phase4Question3Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question3Answer));
        this.Phase4Question4Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question4Answer));
        this.Phase4Question5Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question5Answer));
        this.Phase4Question6Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question6Answer));
        this.Phase4Question7Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question7Answer));
        this.Phase4Question8Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question8Answer));
        this.Phase4Question9Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question9Answer));
        this.Phase4Question10Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question10Answer));
        this.Phase4Question11Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question11Answer));
        this.Phase4Question12Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question12Answer));
        this.Phase4Question13Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question13Answer));
        this.Phase4Question14Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question14Answer));
        this.Phase4Question15Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question15Answer));
        this.Phase4Question16Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question16Answer));
        this.Phase4Question17Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question17Answer));
        this.Phase4Question18Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question18Answer));
        this.Phase4Question19Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question19Answer));
        this.Phase4Question20Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question20Answer));
        this.Phase4Question21Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question21Answer));
        this.Phase4Question22Answer = ((TextView) hasViews.findViewById(R.id.Phase4Question22Answer));
        init();
    }

    private void injectExtras_() {
        Bundle extras_ = getIntent().getExtras();
        if (extras_!= null) {
            if (extras_.containsKey(MOTHER_ID_EXTRA)) {
                this.motherId = extras_.getString(MOTHER_ID_EXTRA);
            }
        }
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
        injectExtras_();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<Phase4A_.IntentBuilder_>
    {
        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, Phase4A_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), Phase4A_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), Phase4A_.class);
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

        /**
         * @param motherId
         *     the value for this extra
         * @return
         *     the IntentBuilder to chain calls
         */
        public Phase4A_.IntentBuilder_ motherId(String motherId) {
            return super.extra(MOTHER_ID_EXTRA, motherId);
        }
    }
}
