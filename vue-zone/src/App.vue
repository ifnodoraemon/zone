<template>
    <v-app>
        <core-toolbar></core-toolbar>

        <core-drawer></core-drawer>

        <core-view></core-view>

        <core-footer></core-footer>

        <core-cta></core-cta>
    </v-app>
</template>

<script>
    import CoreCta from './components/core/Cta';
    import CoreDrawer from './components/core/Drawer';
    import CoreFooter from './components/core/Footer';
    import CoreToolbar from './components/core/Toolbar';
    import CoreView from './components/core/View';

    export default {
        name: 'App',

        components: {
            CoreCta,
            CoreDrawer,
            CoreFooter,
            CoreToolbar,
            CoreView
        },

        data: () => ({
            //
        }),
    };
</script>
