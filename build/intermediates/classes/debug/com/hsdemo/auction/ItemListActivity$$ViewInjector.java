// Generated code from Butter Knife. Do not modify!
package com.hsdemo.auction;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ItemListActivity$$ViewInjector {
  public static void inject(Finder finder, final com.hsdemo.auction.ItemListActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131427430);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427430' for field 'itemsList' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.itemsList = (android.widget.ListView) view;
    view = finder.findById(source, 2131427423);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427423' for field 'toolbar' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.toolbar = (android.support.v7.widget.Toolbar) view;
    view = finder.findById(source, 2131427424);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427424' for field 'tint' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.tint = view;
    view = finder.findById(source, 2131427431);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427431' for field 'progress' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.progress = (android.widget.ProgressBar) view;
    view = finder.findById(source, 2131427429);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427429' for field 'mDrawerLayout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mDrawerLayout = (android.support.v4.widget.DrawerLayout) view;
    view = finder.findById(source, 2131427432);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427432' for field 'drawer' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.drawer = view;
    view = finder.findById(source, 2131427434);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427434' for field 'all' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.all = view;
    view = finder.findById(source, 2131427436);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427436' for field 'noBids' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.noBids = view;
    view = finder.findById(source, 2131427435);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427435' for field 'myItems' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.myItems = view;
    view = finder.findById(source, 2131427437);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427437' for field 'logout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.logout = view;
    view = finder.findById(source, 2131427433);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131427433' for field 'userEmail' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.userEmail = (android.widget.TextView) view;
  }

  public static void reset(com.hsdemo.auction.ItemListActivity target) {
    target.itemsList = null;
    target.toolbar = null;
    target.tint = null;
    target.progress = null;
    target.mDrawerLayout = null;
    target.drawer = null;
    target.all = null;
    target.noBids = null;
    target.myItems = null;
    target.logout = null;
    target.userEmail = null;
  }
}
