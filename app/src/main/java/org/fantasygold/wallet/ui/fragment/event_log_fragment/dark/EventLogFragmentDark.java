package org.fantasygold.wallet.ui.fragment.event_log_fragment.dark;

import org.fantasygold.wallet.R;
import org.fantasygold.wallet.model.gson.history.Log;
import org.fantasygold.wallet.ui.fragment.event_log_fragment.EventLogFragment;

import java.util.List;


public class EventLogFragmentDark extends EventLogFragment {

    @Override
    protected int getLayout() {
        return R.layout.fragment_event_log;
    }

    @Override
    public void updateEventLog(List<Log> logs) {
        mEventLogAdapter = new EventLogAdapter(logs, R.layout.item_event_log, R.layout.item_event_log_data);
        mRecyclerViewLogs.setAdapter(mEventLogAdapter);
    }
}
