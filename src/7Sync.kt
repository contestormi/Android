class SingletonSync private constructor() {

    companion object {
        private var instance: SingletonSync? = null

        fun getInstance(): SingletonSync {
            synchronized(this){
                if (instance == null) {
                    instance = SingletonSync()
                }
            }
            return instance!!
        }
    }
}
