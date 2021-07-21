/*
!! 연산자
 - null 을 허용하지 않는 형태의 주솟값으로 변환하는 연산자입니다.
 - null 의 안정성을 보장받지 못합니다.
 - !! 연산자는 null 을 허용하는 변수에 담긴 객체의 주솟값을 null 을 허용하지 않는 형태의 값으로 변환하는 연산자입니다.
 - null 을 허용하는 변수에 담긴 값을 null 을 허용하지 않는 형태의 변수에 담을 경우에 사용합니다.
 - 변환 과정에서 null 값이 들어 있는 경우 오류가 발생합니다.
 - 이 연산자의 사용은 권장하지 않습니다.
 */
fun main() {
    testFun1("문자열")
    //testFun1(null)

    println("------------------------------")

    testFun2("문자열")
    testFun2(null)

    println("------------------------------")
    testFun3("문자열")
    testFun3(null)

}

/*
str:String? 은 null 값을 허용하는 변수입니다.
반면 value:String 은 null 값을 허용하지 않는 변수입니다.
그러므로 아래 val value1:String = str 은 Type 이 다르기 때문에 Error 가 발생합니다.
String? : null 을 허용하는 변수
String : null 을 허용하지 않는 변수
 */
fun testFun1 (str:String?) {
    //val value:String = str // Error 발생
    val value1:String = str!! // !! 연산자 사용
    println("value1 : $value1")
}

/*
?: 연산자
 - 변수의 값이 null 인 경우 : 설정한 문자열을 변수에 넣습니다.
 - 변수의 값이 null 이 아닌 경우 (변수에 문자열을 받은 경우) : 받은 문자열을 변수에 넣습니다.
 - null 인 경우와 null 이 아닌 경우 모두 사용 할 수 있습니다.
 - null 의 안정성을 보장받을 수 있습니다.
 */
fun testFun2 (str:String?) {
    val value1:String = str ?: "기본문자열"
    println("value1 : $value1")
}

/*
?. 연산자
 - 객체가 null 이 아닌경우 : Property 또는 Method 를 호출합니다.
 - 객체가 null 인 경우 : Property 또는 Method 를 호출하지 않고 전체 값을 null 로 반환합니다.
 - 참조변수를 통해서 Method 를 호출하거나 Member 변수를 사용할 때
  참조변수에 객체의 주솟값이 들어 있다면 객체에 접근해서 Method 나 변수를 사용합니다.
  - 만약 잠조변수에 null 이 들어 있다면 오류가 발생하지 않고 null 을 반환합니다.
 */

/*
Property
 - Kotlin 에서는 변수를 Property 라고 칭합니다.
  (일반적인 변수의 기능에 추가적으로 접근자에 해당하는 getter/setter 와 같은 함수가 내장되어 있기 때문입니다.)
 */
fun testFun3 (str:String?) {
    println("str : $str")
    println("str.length : ${str?.length}")
}











