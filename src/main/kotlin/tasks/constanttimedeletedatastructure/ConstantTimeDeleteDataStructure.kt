package tasks.constanttimedeletedatastructure



class ConstantTimeDeleteDataStructure<V> : DataStructure<V> {
    private val list: ArrayList<V> = ArrayList()
    private val map: MutableMap<V, Int> = mutableMapOf()
    override fun insert(element: V): Boolean {
        if (map.containsKey(element)) return false
        list.add(element)
        map[element] = list.size - 1
        return true
    }

    override fun delete(element: V): Boolean {
        if (map.containsKey(element).not()) return false
        val index = map[element]!!
        list[index] = list[list.size - 1]
        map[list[index]] = index
        list.removeAt(list.size - 1)
        map.remove(element)
        return true
    }

    override fun getAll(): List<V> {
        return list.toList()
    }
}

