package com.zmax.allsamples.adapter.SyncAdapter;
/**
 * Created by Maheswaran on 10/6/2016.
 */
public class AAA_info
{
    //Android Site
    //https://developer.android.com/training/sync-adapters/creating-sync-adapter.html

    //Sync Contact
            //http://blogs.quovantis.com/syncing-contacts-with-an-android-application-2/
    //Sync adapter gitbub realam
            //http://www.dmytrodanylyk.com/android-data-sync-part-2/
            //https://github.com/dmytrodanylyk/android-data-sync-sample/blob/master/app/src/main/java/com/todo/sync/SyncService.java
    
    //Youtube
            //https://www.youtube.com/watch?v=DaSgkc_bDkE

                /*
                1. We are going to create 2 services
                2. Each service primary perpose for delevering object to reprecent the android binder
                    interface.
                3. Binder is low level glue that implements the cross process communicaiton.

                4. when we using binder every time we are talking to android syste service

                */
            //https://www.youtube.com/watch?v=ihtyTpOfbMc


    //http://www.coderzheaven.com/2015/07/04/sync-adapter-android-simple-example/

//111-------------->//http://www.coderzheaven.com/2015/06/30/account-authenticator-demo-accountmanager-android/
    //Account Authenticator Demo using AccountManager in Android
    //Here in this demo we will try to create a Custom authenticator.
    /*The account manager is a centralized service offered by Android system.
        Any application can get the list of accounts and request the user to utilize its auth tokens.*/

   /* Basically it contains a list of Accounts, each one is identified by:
        1. Account name: The user name used to log in. For example, CoderzHeaven
        2. Account type: The type of the account. For example, com.google
    All the accounts should be unique across a device. This is, for a given device,
    there cannot be any two accounts that have the same account name and account type.*/

   /* For each one of the accounts, there is a set of data related with it:
        1. Password: The password of the account. It could be empty also.
    2. AuthTokens: The String used by the server to identify the user, instead of the password.

    All the auth tokens have a type, called AuthTokenType.
    This is because one account could be used for several services
    and for each one of the service there could be different auth tokens

    For example, the account of Google could be used for Gmail and Youtube.
    The authTokenType of Gmail is “mail” and the authTokenType of YouTube is youtube.

    3. UserDatas: Additionally the user can save user data as the pair key/value of type String.
    This is useful when extra data are associated with the account whom are not password neither auth token.

    */
}
