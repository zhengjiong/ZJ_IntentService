# IntentService #

```java
     /**
     * onHandleIntent是在子线程中执行的
     * @param intent
     */
    @Override
        protected void onHandleIntent(Intent intent) {
            debug("onHandleIntent");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
```
> 1.當不需要Service運行完成后繼續停留在後台, 可以使用IntentService, 它會在執行完成所有程序后自動destroy
> 2.onHandleIntent是在子线程中执行的,可以在其中發送廣播用於和Activity通信
> 3.onHandleIntent方法執行完成后,Service会自动销毁