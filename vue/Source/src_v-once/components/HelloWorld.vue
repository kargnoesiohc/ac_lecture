<template>
  <div class="hello">
    <h3>{{msg}}</h3>
    v-once 사용 X : <span>{{username}}</span><br>
    <!--v-once 한번만 렌더링, 즉 아래 changeName 메소드에 의해 username 값이 바뀌지 않음-->
    v-once 사용 O : <span v-once>{{username}}</span><br>
    {{changeName()}}
    <!--username 변경함수 호출-->
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
      username: '홍길동',
    }
  },
  methods: {
    changeName:function () {
      this.username = '이순신';
    }
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
