<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    이름<input type="text" v-model="username"><br><!-- 양방향 바인딩 -->
    <span v-if="username.length<3">이름은 3글자 이상이어야 합니다.</span><br>
    나이<input type="text" v-model="age"><br><!-- 양방향 바인딩 -->
    <span v-if="age<=10||age>=100">나이는 10세 이상 100세 이하여야 합니다.</span><br>
    이름 길이 : {{username.length}}, 나이 {{age}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function(){
    return {
      username:'홍길동',
      age: 20,
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
