package com.example.arrays

fun main(){

    val solution = Solution()
    println(solution.groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")))
}


/*
class Solution {
    fun groupAnagrams(strs: Array<String>) : List<List<String>>{

        if(strs.isEmpty()){
            return emptyList()
        }

        val stringAnagramMaps = mutableMapOf<String, List<String>>()
        for(i in strs.indices){
            val singleCharacter = strs[i]
            val charArray = singleCharacter.toCharArray().sorted()
            val key = charArray.joinToString("")
            if(!stringAnagramMaps.containsKey(key)){
                stringAnagramMaps[key] = listOf(singleCharacter)
            }else{
                val list = stringAnagramMaps[key]!!.toMutableList()
                list.add(singleCharacter)
                stringAnagramMaps[key] = list
            }
        }
        val result = mutableListOf<List<String>>()
        for(value in stringAnagramMaps.values){
            result.add(value)
        }
        return result

    }
}*/

class Solution {
    fun groupAnagrams(strs: Array<String>) : List<List<String>>{

        if(strs.isEmpty()){
            return emptyList()
        }

        val frequencyStringsMap  = mutableMapOf<String, MutableList<String>>()

        for (i in strs.indices){
            val frequencyString = getFrequencyString(strs[i])
            frequencyStringsMap
                .computeIfAbsent(frequencyString) { mutableListOf() }
                .add(strs[i])

        }

        return frequencyStringsMap.values.toList()

    }

    private fun getFrequencyString(str: String): String{
        val freq = IntArray(26)
        for (c in str){
            freq[c-'a']++
        }

        val sb  =  StringBuilder()
        for(i in freq.indices){
            sb.append('a'+i)
            sb.append(freq[i])
        }

        return sb.toString()
    }
}
