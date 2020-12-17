<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    mesg: <input type="text" value="mesg">
    <br>
    v-bind:value="mesg"<input type="text" v-bind:value="mesg">
    <br>
    :value="mesg<input type="text" :value="mesg">
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
      mesg: '홍길동'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
