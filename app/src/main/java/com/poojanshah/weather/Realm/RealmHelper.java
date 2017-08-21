package com.poojanshah.weather.Realm;

import io.realm.Realm;

/**
 * Created by Poojan on 15/07/2017.
 */

/**
 * to get and save data to Realm
 */
public class RealmHelper {
    Realm realm;

    public RealmHelper(Realm realm) {
        this.realm = realm;
    }

//    /**
//     * To save music information to realm
//     * @param result
//     */
//    public void saveData(final Result result){
//        realm.executeTransaction(new Realm.Transaction() {
//            @Override
//            public void execute(Realm realm) {
//                realm.copyToRealmOrUpdate(result);
//            }
//
//        });
//    }
//
//    /**
//     * to get all songs by genre/chart type
//     * @param type
//     * @return
//     */
//    public ArrayList<Result> getMusic(String type){
//        ArrayList<Result> output;
//        RealmResults<Result> result = realm.where(Result.class).equalTo("genre",type).findAll();
//        output = new ArrayList<>(result);
//        return output;
//    }
}
