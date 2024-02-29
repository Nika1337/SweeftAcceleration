package tasks.addbinarystrings

class DefaultAddBinaryStrings : AddBinaryStrings {
    override fun invoke(a: String, b: String): String {
        val stringBuilder = StringBuilder()
        var carry = 0
        var indexA = a.length - 1
        var indexB = b.length - 1

        while (indexA >= 0 || indexB >= 0 || carry == 1) {
            if (indexA >= 0) carry += a[indexA--] - '0'
            if (indexB >= 0) carry += b[indexB--] - '0'
            stringBuilder.append(carry%2)
            carry /= 2
        }
        return stringBuilder.reverse().toString()
    }
}