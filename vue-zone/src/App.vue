<template>
    <v-app>
        <core-toolbar></core-toolbar>

        <core-carousel></core-carousel>

        <core-content></core-content>

        <core-footer></core-footer>

        <core-cta></core-cta>
    </v-app>
</template>

<script>
    import CoreCta from './components/core/Cta';
    import CoreCarousel from './components/core/Carousel';
    import CoreFooter from './components/core/Footer';
    import CoreToolbar from './components/core/Toolbar';
    import CoreContent from './components/core/Content';

    export default {
        name: 'App',

        components: {
            CoreCta,
            CoreCarousel,
            CoreFooter,
            CoreToolbar,
            CoreContent
        },

        data: () => ({
            //
        }),
    };
</script>
