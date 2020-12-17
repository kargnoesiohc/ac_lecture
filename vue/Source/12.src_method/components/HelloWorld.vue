<template>
  <div class="hello">
    이름: {{username}}, 나이: {{age}}
    <br>
    정보: {{sayEcho()}}
    <br>
    정보2: {{test()}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: function (){
    return {
      username: '홍길동',
      age: 20
    }
  },
  methods: {
    sayEcho: function (){
      return this.username + "\t" + this.age;
    },
    test: function(){
      return this.username + "\t" + this.age;
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
