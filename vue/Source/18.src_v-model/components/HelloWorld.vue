<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <!--양방향 바인딩: v-model 사용-->
    mesg: <input type="text" v-model="mesg">
    <br>
    mesg: <input type="text" v-model="mesg">
    <br>
    v-bind:mesg <input type="text" v-bind:value="mesg">
    <br>
    mesg: {{mesg}}
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
      mesg:'홍길동'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
