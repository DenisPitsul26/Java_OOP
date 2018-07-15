package lesson8.home_work8.stack;

import java.util.Arrays;

public class BlackList {
    private Class[] blackList;

    public BlackList(int n) {
        if (n > 0) {
            blackList = new Class[n];
        } else blackList = new Class[5];
    }

    public BlackList() {
        blackList = new Class[5];
    }

    private void expandBlackList() {
        int n = blackList.length;
        if (n == 1) {
            n = 2;
        } else {
            n *= 1.5;
        }
        Class[] tempBlackList = new Class[n];
        System.arraycopy(blackList, 0, tempBlackList, 0, blackList.length);
        blackList = tempBlackList;
    }

    public boolean isInList(Class cl) {
        if (cl == null) {
            throw new IllegalArgumentException("Null reference");
        }
        for (Class aBlackList : blackList) {
            if (aBlackList == cl) {
                return true;
            }
        }
        return false;
    }

    public void addClassInList(Class cl) {
        if (cl == null) {
            throw new IllegalArgumentException("Null reference");
        }

        if (isInList(cl)) {
            return;
        }
        for (int i = 0; i < blackList.length; i++) {
            if (blackList[i] == null) {
                blackList[i] = cl;
                return;
            }
        }
        int n = blackList.length;
        expandBlackList();
        blackList[n] = cl;
    }

    public boolean removeClassInList(Class cl) {
        for (int i = 0; i < blackList.length; i++) {
            if (blackList[i] == cl) {
                blackList[i] = null;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return Arrays.toString(blackList);
    }
}
