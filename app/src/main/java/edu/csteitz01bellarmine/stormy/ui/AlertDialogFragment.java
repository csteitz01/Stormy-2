package edu.csteitz01bellarmine.stormy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;

public class AlertDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(getString(edu.csteitz01bellarmine.stormy.R.string.error_title))
        .setMessage(getString(edu.csteitz01bellarmine.stormy.R.string.error_message))
        .setPositiveButton(getString(edu.csteitz01bellarmine.stormy.R.string.error_button_ok_text), null);

        return builder.create();
    }
}
