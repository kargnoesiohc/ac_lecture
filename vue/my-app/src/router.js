import Vue from 'vue';
import VueRouter from 'vue-router';

import Bar from './components/Bar.vue';
import Foo from './components/Foo.vue';
import NotFound from './components/NotFound.vue';
import FooChild1 from './components/FooChild1.vue';
import FooChild2 from './components/FooChild2.vue';

Vue.use(VueRouter);

const routers = [
    { path: '/', component: Bar, name: "Bar" },
    { path: '/foo', component: Foo, name: "Foo",
        children: [
            {path:'/fooChild1', components:FooChild1},
            {path:'/fooChild2', components:FooChild2},
        ]
    },
    {path:'*', component: NotFound, name:"NotFound"},
]

const router = new VueRouter({routers});
export default router;
