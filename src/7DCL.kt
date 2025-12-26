class SingletonDCL private constructor() {

    companion object {
        @Volatile
        private var instance: SingletonDCL? = null

        fun getInstance(): SingletonDCL {
            return instance ?: synchronized(this){
                instance ?: SingletonDCL().also { instance = it }
            }
        }
    }
}
