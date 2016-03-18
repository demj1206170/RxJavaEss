package xyz.demj.rxjavaess;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by demj on 2016/3/18 0018.
 */
@Data
@Accessors(prefix="m")
@AllArgsConstructor
public class AppInfo implements Comparable<Object> {
    long mLastUpdateTime;
    String mName;
    String mIcon;

    @Override
    public int compareTo(Object lhs) {
        AppInfo f= (AppInfo) lhs;
        return getName().compareTo(f.getName());
    }
}
