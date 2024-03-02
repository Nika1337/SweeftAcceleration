package tasks.constanttimedeletedatastructure

interface DataStructure<V> {
    fun insert(element: V): Boolean
    fun delete(element: V): Boolean
    fun getAll(): List<V>
}