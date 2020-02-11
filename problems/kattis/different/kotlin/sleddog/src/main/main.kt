package sleddog

fun main(args: Array<String>) {
    var line = readLine();
    while (line != null) {
        var (a, b) = line.split(' ');
        println(diff(a.toLong(), b.toLong()));
        line = readLine();
    }
}

fun diff(a: Long, b: Long): Long {
    return Math.abs(a - b)
}
